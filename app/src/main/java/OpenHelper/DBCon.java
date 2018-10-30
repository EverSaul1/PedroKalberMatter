package OpenHelper;

import android.content.Context;


public class DBCon extends ExternalSQLiteOpenHelper{
    private static final String DATABASE_NAME="asistencia.db";
    private static final int DATABASE_VERSION=3;

    public DBCon(Context context) {
        //super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
}
