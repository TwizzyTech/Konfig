package hype.tech.twizzy.Konfig

import com.hypixel.hytale.server.core.plugin.JavaPlugin
import com.hypixel.hytale.server.core.plugin.JavaPluginInit
import java.util.concurrent.CompletableFuture

class KonfigPlugin(init: JavaPluginInit) : JavaPlugin(init) {

    companion object {
        lateinit var instance: KonfigPlugin
            private set
    }

    init {
        instance = this
    }

    override fun preLoad(): CompletableFuture<Void?>? {
        logger.atInfo().log("[Konfig] Pre-loading...")
        return CompletableFuture.completedFuture(null)
    }

    override fun setup() {
        logger.atInfo().log("[Konfig] Setting up...")
    }

    override fun start() {
        logger.atInfo().log("[Konfig] Started. Ready for Vibe coding!")
    }

    override fun shutdown() {
        logger.atInfo().log("[Konfig] Shutting down.")
    }
}
