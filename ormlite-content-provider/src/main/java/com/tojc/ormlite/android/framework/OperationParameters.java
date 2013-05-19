/*
 * This file is part of the Android-OrmLiteContentProvider package.
 * 
 * Copyright (c) 2012, Jaken Jarvis (jaken.jarvis@gmail.com)
 * 
 * Permission to use, copy, modify, and/or distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR
 * ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF
 * OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 * 
 * The author may be contacted via 
 * https://github.com/jakenjarvis/Android-OrmLiteContentProvider
 */
package com.tojc.ormlite.android.framework;

import android.content.ContentValues;
import android.net.Uri;

/**
 * This keeps the parameters of Operation. Through the interface and exposes
 * only the methods required for event.
 * @author Jaken
 */
public class OperationParameters {
    public interface OperationParametersBaseInterface {
        Uri getUri();
    }

    public interface QueryParameters extends OperationParametersBaseInterface {
        String[] getProjection();

        String getSelection();

        String[] getSelectionArgs();

        String getSortOrder();
    }

    public interface InsertParameters extends OperationParametersBaseInterface {
        ContentValues getValues();
    }

    public interface DeleteParameters extends OperationParametersBaseInterface {
        String getSelection();

        String[] getSelectionArgs();
    }

    public interface UpdateParameters extends OperationParametersBaseInterface {
        ContentValues getValues();

        String getSelection();

        String[] getSelectionArgs();
    }
}
