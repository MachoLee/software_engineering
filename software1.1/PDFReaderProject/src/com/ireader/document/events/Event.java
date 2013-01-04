package com.ireader.document.events;

public interface Event<T>
{
    void dispatchOn(Object listener);
}
