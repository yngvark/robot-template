package robot

import myproject.robot

class Chrome(private val profile:String) {
    fun open(webpage: String) {
        robot.run(listOf(
            "/usr/bin/google-chrome-stable",
            "--disable-gpu",
            "--profile-directory=$profile",
            webpage
        ))

    }
}