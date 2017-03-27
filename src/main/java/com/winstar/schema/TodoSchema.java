package com.winstar.schema;


import com.oembedler.moon.graphql.boot.GraphQLContext;
import com.oembedler.moon.graphql.engine.stereotype.*;
import com.winstar.schema.objecttype.RootObjectType;
import com.winstar.schema.objecttype.TodoObjectType;
import com.winstar.schema.objecttype.UserObjectType;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@GraphQLSchema
public class TodoSchema {

    @GraphQLSchemaQuery
    private RootObjectType root;

    private UserObjectType theOnlyUser = new UserObjectType();
    private List<TodoObjectType> todos = new ArrayList<>();

    private TodoSimpleListConnection simpleConnectionTodo;
    private int nextTodoId = 0;


    public TodoSchema() {
        addTodo("Do Something");
        addTodo("Other todo");

        simpleConnectionTodo = new TodoSimpleListConnection(todos);
    }

    public String addTodo(String text) {
        TodoObjectType newTodo = new TodoObjectType();
        newTodo.setId(Integer.toString(nextTodoId++));
        newTodo.setText(text);
        todos.add(newTodo);
        return newTodo.getId(newTodo);
    }

    public void removeTodo(String id) {
        TodoObjectType del = todos.stream().filter(todo -> todo.getId(todo).equals(id)).findFirst().get();
        todos.remove(del);
    }

    public void renameTodo(String id, String text) {
        TodoObjectType matchedTodo = todos.stream().filter(todo -> todo.getId(todo).equals(id)).findFirst().get();
        matchedTodo.setText(text);
    }

    public List<String> removeCompletedTodos() {
        List<String> toDelete = todos.stream()
                .filter(TodoObjectType::isComplete)
                .map(todoObjectType -> todoObjectType.getId(todoObjectType))
                .collect(Collectors.toList());
        todos.removeIf(todo -> toDelete.contains(todo.getId(todo)));
        return toDelete;
    }

    public List<String> markAllTodos(boolean complete) {
        List<String> changed = new ArrayList<>();
        todos.stream().filter(todo -> complete != todo.isComplete()).forEach(todo -> {
            changed.add(todo.getId(todo));
            todo.setComplete(complete);
        });

        return changed;
    }

    public void changeTodoStatus(String id, boolean complete) {
        TodoObjectType todo = getTodo(id);
        todo.setComplete(complete);
    }

    public TodoObjectType getTodo(String id) {
        return todos.stream().filter(todo -> todo.getId(todo).equals(id)).findFirst().get();
    }

    public List<TodoObjectType> getTodos(List<String> ids) {
        return todos.stream().filter(todo -> ids.contains(todo.getId(todo))).collect(Collectors.toList());
    }

    public UserObjectType getTheOnlyUser() {
        return theOnlyUser;
    }


    public TodoSimpleListConnection getSimpleConnectionTodo() {
        return simpleConnectionTodo;
    }

    public static class AddTodoIn {
        private String text;

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }

    // --- mutations

    @GraphQLMutation
    @GraphQLDescription("Mutation to add new todo item")
    public
    @GraphQLOut("todoEdge")
    TodoObjectType.TodoEdgeObjectType addTodoMutation(@GraphQLIn("addTodoInput") AddTodoIn addTodoInput) {

        TodoObjectType.TodoEdgeObjectType todoEdgeObjectType = new TodoObjectType.TodoEdgeObjectType();
        todoEdgeObjectType.setCursor("test-cursor");
        todoEdgeObjectType.setNode(new TodoObjectType());
        todoEdgeObjectType.getNode().setId("id-12345");
        todoEdgeObjectType.getNode().setText("simple text");
        todoEdgeObjectType.getNode().setComplete(false);

        return todoEdgeObjectType;
    }

    @GraphQLMutation
    public
    @GraphQLOut("filename")
    String uploadFile(GraphQLContext graphQLContext) {
        return graphQLContext.getUploadedFile().getName();
    }

    @GraphQLMutation
    public String updateTodoMutation(@GraphQLIn("updateTodoInput") String newText) {
        return "Simple output string";
    }

}
