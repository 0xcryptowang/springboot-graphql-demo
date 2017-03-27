package com.winstar.domain.objecttype;

import com.oembedler.moon.graphql.engine.stereotype.GraphQLField;
import com.oembedler.moon.graphql.engine.stereotype.GraphQLIn;
import com.oembedler.moon.graphql.engine.stereotype.GraphQLObject;
import com.winstar.domain.schema.StaticData;
import graphql.schema.DataFetchingEnvironment;

import java.util.List;

@GraphQLObject("Viewer")
public class Viewer {
    public String token;

    public Viewer() {}

    public Viewer(String token) {
        this.token = token;
    }

    @GraphQLField
    public List<Talk> talks(DataFetchingEnvironment env) {
        Viewer viewer = (Viewer) env.getSource();
        if(viewer.token != null) {
            return StaticData.talks;
        } else {
            return null;
        }
    }

    @GraphQLField
    public Talk talk(@GraphQLIn("title") final String title) {
        for (Talk talk : StaticData.talks) {
            if (talk.getTitle().equals(title)) {
                return talk;
            }
        }
        return null;
    }
}
