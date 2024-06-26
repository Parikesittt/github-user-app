package com.example.submissionawalmdl3

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ViewModelFactory(private val pref: SettingPreferences): ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SettingThemeViewModel::class.java)){
            return SettingThemeViewModel(pref) as T
        }
        throw IllegalArgumentException("Unknown Viewmodel class: " + modelClass.name)
    }
}