package com.ireader.document.models;

import com.ireader.document.events.CurrentPageListener;
import com.ireader.document.events.EventDispatcher;

public class CurrentPageModel extends EventDispatcher
{
    private int currentPageIndex;

    public void setCurrentPageIndex(int currentPageIndex)
    {
        if (this.currentPageIndex != currentPageIndex)
        {
            this.currentPageIndex = currentPageIndex;
            dispatch(new CurrentPageListener.CurrentPageChangedEvent(currentPageIndex));
        }
    }
}
