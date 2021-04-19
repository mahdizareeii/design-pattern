package com.kotlin.testapp.designpatterns.structural.facade.translator

import com.kotlin.testapp.designpatterns.structural.facade.Language

interface Translator {
    fun translate(text: String, language: Language)
}