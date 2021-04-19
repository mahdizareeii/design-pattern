package com.kotlin.testapp.designpatterns.structural.facade.translator

import com.kotlin.testapp.designpatterns.structural.facade.Language

class FrenchTranslator  : Translator {
    override fun translate(text: String, language: Language) {
        println("translate from ${language.name} to french")
    }
}