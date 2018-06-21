/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.farmacia.mysql;

/**
 *
 * @author nuevo
 */
interface AttributeConverter<T0, T1> {
    public T1 convertToDatabaseColumn(T0 entityValue);     
    public T0 convertToEntityAttribute(T1 databaseValue); 
}
