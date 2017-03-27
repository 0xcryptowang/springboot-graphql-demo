package com.winstar.domain.objecttype;

import com.oembedler.moon.graphql.engine.stereotype.*;

@GraphQLObject("Root")
public class RootObjectType {

    @GraphQLField
    public Illegal illegal(@GraphQLIn("plateNumber") final String plateNumber, @GraphQLIn("plateNumberType") final String plateNumberType) {
        Illegal illegal = new Illegal();
        illegal.setSerialNumber("222");
        illegal.setPlateNumber("111");
        illegal.setPlateNumberType("02");
        return illegal;
    }
}
