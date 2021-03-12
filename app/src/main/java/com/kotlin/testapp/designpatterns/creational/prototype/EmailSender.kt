package com.kotlin.testapp.designpatterns.creational.prototype

class EmailSender(
    var recipient: String,
    var subject: String,
    var message: String
) : Cloneable {

    constructor(emailSender: EmailSender) : this(
        recipient = emailSender.recipient,
        subject = emailSender.subject,
        message = emailSender.message
    )

    fun send() {
        println(
            "subject : $subject \n" +
                    "message : $message \n" +
                    "recipient : $recipient \n"
        )
    }

    public override fun clone(): EmailSender {
        return EmailSender(this)
    }

}