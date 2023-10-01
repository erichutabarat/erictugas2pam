package com.erictugas2pam.app.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GalleryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Skill Pemrograman Saya\n" + listOf(
            "Javascript",
            "Python",
            "C++"
        ).joinToString(separator="\n")
    }
    val text: LiveData<String> = _text
}