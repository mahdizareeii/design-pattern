package com.kotlin.testapp.designpatterns.structural.composite

interface Database {
    fun createDatabase(dbName: String)
    fun removeDatabase(dbName: String)
    fun createTable(tblName: String)
    fun removeTable(tblName: String)
}