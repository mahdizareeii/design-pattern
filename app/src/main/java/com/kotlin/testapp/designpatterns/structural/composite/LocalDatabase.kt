package com.kotlin.testapp.designpatterns.structural.composite

class LocalDatabase : Database {

    override fun createDatabase(dbName: String) {
        println("$dbName database created in local")
    }

    override fun removeDatabase(dbName: String) {
        println("$dbName database removed in local")
    }

    override fun createTable(tblName: String) {
        println("$tblName table created in local")
    }

    override fun removeTable(tblName: String) {
        println("$tblName table removed in local")
    }

}