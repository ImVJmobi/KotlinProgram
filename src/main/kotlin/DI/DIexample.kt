package DI


class AndroidVersion( ){

    fun startVersion(){
        println("version is running")
    }
}

class  AndroidSmartphone(  private val androidVersion: AndroidVersion){

    fun run(){
        androidVersion.startVersion()
    }
}

fun main(){
    val androidVersion = AndroidVersion()
    val androidSmartphone = AndroidSmartphone(androidVersion)
    androidSmartphone.run()
}