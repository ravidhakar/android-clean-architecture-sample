package com.example.cleanarchitecture.core.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

abstract class BaseViewModel<State, Event> : ViewModel() {
    
    private val _state = MutableStateFlow(initialState())
    val state: StateFlow<State> = _state
    
    protected abstract fun initialState(): State
    
    protected fun setState(reducer: State.() -> State) {
        _state.value = _state.value.reducer()
    }
    
    abstract fun onEvent(event: Event)
    
    protected fun launchCoroutine(block: suspend () -> Unit) {
        viewModelScope.launch {
            try {
                block()
            } catch (e: Exception) {
                handleError(e)
            }
        }
    }
    
    protected open fun handleError(exception: Exception) {
        // Override in child classes for specific error handling
    }
}