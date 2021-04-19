package com.kotlin.testapp.designpatterns.structural.facade.translator

import com.kotlin.testapp.designpatterns.structural.facade.Language

class PersianTranslator : Translator {
    override fun translate(text: String, language: Language) {
        println("translate $text from ${language.name} to persian")
    }
}