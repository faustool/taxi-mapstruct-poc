package com.vfs.poc.taxi.types;

import java.lang.annotation.Inherited;

import lang.taxi.annotations.DataType;

@DataType(documentation = "A primitive data type")
@Inherited
public @interface PrimitiveDataType {
    Class<?> value();
}
