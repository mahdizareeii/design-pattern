package com.kotlin.testapp.designpatterns.structural.facade

import com.kotlin.testapp.designpatterns.structural.facade.translator.EnglishTranslator
import com.kotlin.testapp.designpatterns.structural.facade.translator.FrenchTranslator
import com.kotlin.testapp.designpatterns.structural.facade.translator.PersianTranslator

class TranslatorManager {

    private val persianTranslator = PersianTranslator()
    private val englishTranslator = EnglishTranslator()
    private val frenchTranslator = FrenchTranslator()

    fun translateDetect(text: String, from: Language, to: Language) {
        when (to) {
            Language.PERSIAN -> persianTranslator.translate(text, from)
            Language.ENGLISH -> englishTranslator.translate(text, from)
            Language.FRENCH -> frenchTranslator.translate(text, from)
        }
    }

}