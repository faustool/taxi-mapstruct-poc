package com.vfs.poc.taxi.types;

import java.lang.annotation.Inherited;

import lang.taxi.annotations.DataType;

@DataType(documentation = "Represent the Taxilang primitive String data type")
@PrimitiveDataType(String.class)
@Inherited
public @interface StringDataType {
    
}
