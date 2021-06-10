package com.kotlin.testapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.kotlin.testapp.designpatterns.behavioral.command.CommandManager
import com.kotlin.testapp.designpatterns.behavioral.command.command.TurnOffCommand
import com.kotlin.testapp.designpatterns.behavioral.command.command.TurnOnCommand
import com.kotlin.testapp.designpatterns.behavioral.command.electricalsystems.Computer
import com.kotlin.testapp.designpatterns.behavioral.command.electricalsystems.PlayStation
import com.kotlin.testapp.designpatterns.behavioral.command.electricalsystems.TV
import com.kotlin.testapp.designpatterns.behavioral.observer.ObservableText
import com.kotlin.testapp.designpatterns.behavioral.observer.TextObserver
import com.kotlin.testapp.designpatterns.behavioral.strategy.AnalyticsManager
import com.kotlin.testapp.designpatterns.behavioral.strategy.analytics.FirebaseAnalytics
import com.kotlin.testapp.designpatterns.creational.abstractfactory.factories.motorcyclefactory.MotorcycleFactory
import com.kotlin.testapp.designpatterns.creational.abstractfactory.motorizedfactory.MotorizedFactory
import com.kotlin.testapp.designpatterns.creational.abstractfactory.motorizedfactory.MotorizedType
import com.kotlin.testapp.designpatterns.creational.builder.ToastBuilder
import com.kotlin.testapp.designpatterns.creational.factory.CarFactory
import com.kotlin.testapp.designpatterns.creational.factory.CarType
import com.kotlin.testapp.designpatterns.creational.prototype.EmailSender
import com.kotlin.testapp.designpatterns.creational.singleton.SingleTonTest
import com.kotlin.testapp.designpatterns.structural.adapter.PlayerAdapter
import com.kotlin.testapp.designpatterns.structural.bridge.chat.Group
import com.kotlin.testapp.designpatterns.structural.bridge.chat.PV
import com.kotlin.testapp.designpatterns.structural.bridge.messanger.Telegram
import com.kotlin.testapp.designpatterns.structural.bridge.messanger.WhatsApp
import com.kotlin.testapp.designpatterns.structural.composite.LocalDatabase
import com.kotlin.testapp.designpatterns.structural.composite.ServerDatabase
import com.kotlin.testapp.designpatterns.structural.decorator.HumanDecoratorJavaSolution
import com.kotlin.testapp.designpatterns.structural.decorator.human.Human
import com.kotlin.testapp.designpatterns.structural.facade.Language
import com.kotlin.testapp.designpatterns.structural.facade.TranslatorManager
import com.kotlin.testapp.designpatterns.structural.flyweight.GunFactory
import com.kotlin.testapp.designpatterns.structural.flyweight.GunType
import com.kotlin.testapp.designpatterns.structural.proxy.GameCharProxy
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnClick.setOnClickListener {
            commandDesignPatternTest()
        }
    }

    private fun builderDesignPatternTest() {
        ToastBuilder.Builder(this)
            .setText("hello world")
            .setDuration(Toast.LENGTH_LONG)
            .build()
    }

    private fun factoryDesignPatternTest() {
        val factory = CarFactory()
        val car = factory.create(CarType.TOYOTA)
        car?.move()
        car?.drift()
        car?.brake()
    }

    private fun abstractFactoryDesignPatternTest() {
        val factory = MotorizedFactory.createFactory<MotorcycleFactory>()
        val motorCycle = factory.create(MotorizedType.SUZUKI)
        motorCycle.turnOn()
        motorCycle.turnOff()
    }

    private fun singletonDesignPatternTest() {
        val instance = SingleTonTest.instance
        println(instance::class.java.name)
    }

    private fun prototypeDesignPatternTest() {
        val sender = EmailSender(
            recipient = "test1@gmail.com",
            subject = "hiring",
            message = "hello dear user"
        )
        sender.send()

        val sender2 = sender.clone()
        sender2.recipient = "test2@gmail.com"
        sender2.send()

        /**
         *  we can use
         *  ***
         *  val sender2 = sender.copy(recipient = "test2@gmail.com")
         *  ***
         *  in kotlin but in java we use that solution
         */
    }

    private fun adapterDesignPatternTest() {
        val playerAdapter = PlayerAdapter()
        playerAdapter.play("hayedeh.mp3")
    }

    private fun compositeDesignPatternTest() {
        val dbName = "dbPosts"
        val tblName = "tblPosts"

        val localDB = LocalDatabase()
        localDB.createDatabase(dbName)
        localDB.createTable(tblName)

        val serverDB = ServerDatabase()
        serverDB.createDatabase(dbName)
        serverDB.createTable(tblName)
    }

    private fun bridgeDesignPatternTest() {
        val message = "hello please follow my facebook page"
        val pvMessage = PV(message)
        val groupMessage = Group(message)

        val telegram = Telegram()
        telegram.sendMessage(pvMessage)
        telegram.sendMessage(groupMessage)

        val whatsApp = WhatsApp()
        whatsApp.sendMessage(pvMessage)
        whatsApp.sendMessage(groupMessage)
    }

    //decorator design pattern use for add property to a class without altering the structure
    private fun decoratorDesignPatternTest() {
        val humanDecorator = HumanDecoratorJavaSolution(Human())
        humanDecorator.run()
    }

    private fun facadeDesignPatternTest() {
        val translator = TranslatorManager()
        translator.translateDetect("Hello", Language.ENGLISH, Language.PERSIAN)
    }

    //store objects instance with flyweight design pattern for manage memory
    private fun flyweightDesignPatternTest() {
        val gun = GunFactory.getGun(GunType.MP5)
        gun.fire()
    }

    //if our object has many heavy configuration we can use proxy design pattern for it
    private fun proxyDesignPatternTest() {
        val gameChar = GameCharProxy()
        gameChar.runCharacter()
    }

    //observer design pattern helps us to know when our object changed
    private fun observerDesignPatternTest() {
        val observer = object : TextObserver {
            override fun onChanged(text: String) {
                println("$text the value now changed...")
            }
        }

        val text = ObservableText(observer)

        text.value = "hello world"
    }

    //when you have multiple objects of the same nature with different functionalities
    private fun strategyDesignPatternTest() {
        val firebase = FirebaseAnalytics()
        //val firehouse = FireHouseAnalytics()
        //val oneSignal = OneSignalAnalytics()
        val manager = AnalyticsManager(firebase)
        manager.sendAnalytics()
    }

    //when we want do something for many classes we can use command design pattern
    private fun commandDesignPatternTest() {
        //get instance from command manager
        val manager = CommandManager()

        //get instance from electrical classes
        val tv = TV()
        val playStation = PlayStation()
        val computer = Computer()

        //turn on all electrical systems
        manager.addCommand(TurnOnCommand(tv))
        manager.addCommand(TurnOnCommand(playStation))
        manager.addCommand(TurnOnCommand(computer))
        manager.executeCommand()

        //turn off all electrical systems
        manager.addCommand(TurnOffCommand(tv))
        manager.addCommand(TurnOffCommand(playStation))
        manager.addCommand(TurnOffCommand(computer))
        manager.executeCommand()
    }
}