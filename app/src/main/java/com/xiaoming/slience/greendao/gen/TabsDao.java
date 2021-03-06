package com.xiaoming.slience.greendao.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.xiaoming.slience.bean.Tabs;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "TABS".
*/
public class TabsDao extends AbstractDao<Tabs, Long> {

    public static final String TABLENAME = "TABS";

    /**
     * Properties of entity Tabs.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property TabName = new Property(1, String.class, "tabName", false, "TabName");
        public final static Property TabId = new Property(2, String.class, "tabId", false, "TabId");
        public final static Property Visible = new Property(3, String.class, "visible", false, "VISIBLE");
    }


    public TabsDao(DaoConfig config) {
        super(config);
    }
    
    public TabsDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"TABS\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"TabName\" TEXT," + // 1: tabName
                "\"TabId\" TEXT," + // 2: tabId
                "\"VISIBLE\" TEXT);"); // 3: visible
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"TABS\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Tabs entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String tabName = entity.getTabName();
        if (tabName != null) {
            stmt.bindString(2, tabName);
        }
 
        String tabId = entity.getTabId();
        if (tabId != null) {
            stmt.bindString(3, tabId);
        }
 
        String visible = entity.getVisible();
        if (visible != null) {
            stmt.bindString(4, visible);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Tabs entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String tabName = entity.getTabName();
        if (tabName != null) {
            stmt.bindString(2, tabName);
        }
 
        String tabId = entity.getTabId();
        if (tabId != null) {
            stmt.bindString(3, tabId);
        }
 
        String visible = entity.getVisible();
        if (visible != null) {
            stmt.bindString(4, visible);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Tabs readEntity(Cursor cursor, int offset) {
        Tabs entity = new Tabs( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // tabName
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // tabId
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3) // visible
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Tabs entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setTabName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setTabId(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setVisible(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Tabs entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Tabs entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Tabs entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
