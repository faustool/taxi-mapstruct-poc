package com.vfs.poc.taxi.types;

import java.lang.annotation.Inherited;

import lang.taxi.annotations.DataType;

@DataType(documentation = "Represent a billing street address with number and name")
@GenericStreetAddress
@Inherited
public @interface BillingStreetAddress {
    
}
