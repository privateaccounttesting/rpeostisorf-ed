package com.nicossteam.piratelive

import android.os.Bundle
import androidx.leanback.app.BrowseSupportFragment
import androidx.leanback.widget.ArrayObjectAdapter
import androidx.leanback.widget.ListRow
import androidx.leanback.widget.ListRowPresenter
import androidx.leanback.widget.HeaderItem
import androidx.leanback.widget.CardPresenter

class MainBrowseFragment : BrowseSupportFragment() {
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setupUIElements()
        loadRows()
    }

    private fun setupUIElements() {
        title = "PirateLive"
        brandColor = resources.getColor(R.color.black, null)
        headersState = HEADERS_ENABLED
        isHeadersTransitionOnBackEnabled = true
    }

    private fun loadRows() {
        val rowsAdapter = ArrayObjectAdapter(ListRowPresenter())
        val categories = listOf(
            "Domů", "Filmy", "Seriály", "Sportovní přenosy", "Live TV", "PPV Přenosy", "PPV Záznamy", "Oblíbené", "Hledat"
        )
        for ((i, category) in categories.withIndex()) {
            val listRowAdapter = ArrayObjectAdapter(CardPresenter())
            // Přidej ukázková data pro každou kategorii
            for (j in 1..5) {
                listRowAdapter.add("Ukázkový obsah $j")
            }
            val header = HeaderItem(i.toLong(), category)
            rowsAdapter.add(ListRow(header, listRowAdapter))
        }
        adapter = rowsAdapter
    }
} 
