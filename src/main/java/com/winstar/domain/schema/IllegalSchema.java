
package com.winstar.domain.schema;

import com.oembedler.moon.graphql.engine.stereotype.*;
import com.winstar.domain.input.IllegalInput;
import com.winstar.domain.objecttype.*;

@GraphQLSchema
public class IllegalSchema {

    @GraphQLSchemaQuery
    private RootObjectType root;


    @GraphQLMutation
    @GraphQLOut("illegal")
    public Illegal illegal(@GraphQLIn("illegalInput") IllegalInput illegalInput) {
        return null;
    }
}
