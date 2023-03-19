package com.example.bluetoothchat.domain.chat

import com.example.bluetoothchat.data.chat.BluetoothMessage

sealed interface ConnectionResult {
    object ConnectionEstablished: ConnectionResult
    data class TransferSucceeded(val message: BluetoothMessage): ConnectionResult
    data class Error(val message: String): ConnectionResult
}