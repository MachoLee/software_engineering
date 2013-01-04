package org.vudroid.pdfdroid;

import com.ireader.document.BaseViewerActivity;
import com.ireader.document.DecodeService;
import com.ireader.document.DecodeServiceBase;

import org.vudroid.pdfdroid.codec.PdfContext;

public class PdfViewerActivity extends BaseViewerActivity
{
    @Override
    protected DecodeService createDecodeService()
    {
        return new DecodeServiceBase(new PdfContext());
    }
}
