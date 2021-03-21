package com.kotlin.testapp.designpatterns.structural.composite

class ServerDatabase : Database {

    override fun createDatabase(dbName: String) {
        println("$dbName database created in server")
    }

    override fun removeDatabase(dbName: String) {
        println("$dbName database removed in server")
    }

    override fun createTable(tblName: String) {
        println("$tblName table created in server")
    }

    override fun removeTable(tblName: String) {
        println("$tblName table removed in server")
    }

}