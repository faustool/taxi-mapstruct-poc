package com.vfs.poc.taxi.types;

import java.lang.annotation.Inherited;

import lang.taxi.annotations.DataType;

@DataType(documentation = "Represent a generic street address with number and name")
@Inherited
@StringDataType
public @interface GenericStreetAddress {
    
}
