package eu.kanade.tachiyomi.extension.ar.procomic

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class Procomic :
    Madara(
        "Procomic",
        "https://procomic.pro/",
        "ar",
        dateFormat = SimpleDateFormat("MM/dd/yyyy", Locale.ROOT),
    ) {
    override val useLoadMoreRequest = LoadMoreStrategy.Never
    override val useNewChapterEndpoint = true
    }
