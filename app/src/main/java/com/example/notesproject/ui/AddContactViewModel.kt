package com.example.dbproject.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.dbproject.model.Contact
import com.example.dbproject.model.contactsDatabase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AddContactViewModel @Inject constructor(
    private val db: contactsDatabase
): ViewModel() {

    fun addContact(note: Contact){
        viewModelScope.launch {
//        val contact = Contact(name = title, phone = desc)
            db.dao.addContact(note)
        }
    }

    fun editContact(note: Contact){
        viewModelScope.launch {
//        val contact = Contact(name = title, phone = desc)
            db.dao.editContact(note)
        }
    }


    fun deleteContact(note: Contact){
        viewModelScope.launch {
            db.dao.deleteContact(note)
        }
        }
    }
