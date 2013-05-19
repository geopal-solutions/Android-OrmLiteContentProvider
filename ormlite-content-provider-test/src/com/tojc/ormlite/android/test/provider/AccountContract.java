package com.tojc.ormlite.android.test.provider;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;

public final class AccountContract implements BaseColumns {

    private AccountContract() {
        // utility constructor
    }

    public static final String AUTHORITY = "com.tojc.ormlite.android.test";

    public static final String CONTENT_URI_PATH = "accounts";

    public static final String MIMETYPE_TYPE = "accounts";
    public static final String MIMETYPE_NAME = "com.tojc.ormlite.android.test.provider";

    public static final Uri CONTENT_URI = new Uri.Builder().scheme(ContentResolver.SCHEME_CONTENT).authority(AUTHORITY).appendPath(CONTENT_URI_PATH).build();

    public static final String NAME = "name";
}
