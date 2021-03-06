package com.csq.thesceneryalong.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.csq.thesceneryalong.db.Track;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table TRACK.
*/
public class TrackDao extends AbstractDao<Track, Long> {

    public static final String TABLENAME = "TRACK";

    /**
     * Properties of entity Track.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property UniqueMack = new Property(1, String.class, "uniqueMack", false, "UNIQUE_MACK");
        public final static Property Version = new Property(2, Integer.class, "version", false, "VERSION");
        public final static Property Name = new Property(3, String.class, "name", false, "NAME");
        public final static Property Description = new Property(4, String.class, "description", false, "DESCRIPTION");
        public final static Property BeginTime = new Property(5, long.class, "beginTime", false, "BEGIN_TIME");
        public final static Property EndTime = new Property(6, Long.class, "endTime", false, "END_TIME");
        public final static Property PointsNum = new Property(7, Integer.class, "pointsNum", false, "POINTS_NUM");
        public final static Property FirstPointTime = new Property(8, Long.class, "firstPointTime", false, "FIRST_POINT_TIME");
        public final static Property LastPointTime = new Property(9, Long.class, "lastPointTime", false, "LAST_POINT_TIME");
        public final static Property MovingTime = new Property(10, Long.class, "movingTime", false, "MOVING_TIME");
        public final static Property MovingDistance = new Property(11, Double.class, "movingDistance", false, "MOVING_DISTANCE");
        public final static Property SimulateTime = new Property(12, Long.class, "simulateTime", false, "SIMULATE_TIME");
        public final static Property SceneryNum = new Property(13, Integer.class, "sceneryNum", false, "SCENERY_NUM");
        public final static Property RecordStatus = new Property(14, Integer.class, "recordStatus", false, "RECORD_STATUS");
    };

    private DaoSession daoSession;


    public TrackDao(DaoConfig config) {
        super(config);
    }
    
    public TrackDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'TRACK' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'UNIQUE_MACK' TEXT NOT NULL ," + // 1: uniqueMack
                "'VERSION' INTEGER," + // 2: version
                "'NAME' TEXT NOT NULL ," + // 3: name
                "'DESCRIPTION' TEXT," + // 4: description
                "'BEGIN_TIME' INTEGER NOT NULL ," + // 5: beginTime
                "'END_TIME' INTEGER," + // 6: endTime
                "'POINTS_NUM' INTEGER," + // 7: pointsNum
                "'FIRST_POINT_TIME' INTEGER," + // 8: firstPointTime
                "'LAST_POINT_TIME' INTEGER," + // 9: lastPointTime
                "'MOVING_TIME' INTEGER," + // 10: movingTime
                "'MOVING_DISTANCE' REAL," + // 11: movingDistance
                "'SIMULATE_TIME' INTEGER," + // 12: simulateTime
                "'SCENERY_NUM' INTEGER," + // 13: sceneryNum
                "'RECORD_STATUS' INTEGER);"); // 14: recordStatus
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'TRACK'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Track entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getUniqueMack());
 
        Integer version = entity.getVersion();
        if (version != null) {
            stmt.bindLong(3, version);
        }
        stmt.bindString(4, entity.getName());
 
        String description = entity.getDescription();
        if (description != null) {
            stmt.bindString(5, description);
        }
        stmt.bindLong(6, entity.getBeginTime());
 
        Long endTime = entity.getEndTime();
        if (endTime != null) {
            stmt.bindLong(7, endTime);
        }
 
        Integer pointsNum = entity.getPointsNum();
        if (pointsNum != null) {
            stmt.bindLong(8, pointsNum);
        }
 
        Long firstPointTime = entity.getFirstPointTime();
        if (firstPointTime != null) {
            stmt.bindLong(9, firstPointTime);
        }
 
        Long lastPointTime = entity.getLastPointTime();
        if (lastPointTime != null) {
            stmt.bindLong(10, lastPointTime);
        }
 
        Long movingTime = entity.getMovingTime();
        if (movingTime != null) {
            stmt.bindLong(11, movingTime);
        }
 
        Double movingDistance = entity.getMovingDistance();
        if (movingDistance != null) {
            stmt.bindDouble(12, movingDistance);
        }
 
        Long simulateTime = entity.getSimulateTime();
        if (simulateTime != null) {
            stmt.bindLong(13, simulateTime);
        }
 
        Integer sceneryNum = entity.getSceneryNum();
        if (sceneryNum != null) {
            stmt.bindLong(14, sceneryNum);
        }
 
        Integer recordStatus = entity.getRecordStatus();
        if (recordStatus != null) {
            stmt.bindLong(15, recordStatus);
        }
    }

    @Override
    protected void attachEntity(Track entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Track readEntity(Cursor cursor, int offset) {
        Track entity = new Track( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getString(offset + 1), // uniqueMack
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // version
            cursor.getString(offset + 3), // name
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // description
            cursor.getLong(offset + 5), // beginTime
            cursor.isNull(offset + 6) ? null : cursor.getLong(offset + 6), // endTime
            cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7), // pointsNum
            cursor.isNull(offset + 8) ? null : cursor.getLong(offset + 8), // firstPointTime
            cursor.isNull(offset + 9) ? null : cursor.getLong(offset + 9), // lastPointTime
            cursor.isNull(offset + 10) ? null : cursor.getLong(offset + 10), // movingTime
            cursor.isNull(offset + 11) ? null : cursor.getDouble(offset + 11), // movingDistance
            cursor.isNull(offset + 12) ? null : cursor.getLong(offset + 12), // simulateTime
            cursor.isNull(offset + 13) ? null : cursor.getInt(offset + 13), // sceneryNum
            cursor.isNull(offset + 14) ? null : cursor.getInt(offset + 14) // recordStatus
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Track entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setUniqueMack(cursor.getString(offset + 1));
        entity.setVersion(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setName(cursor.getString(offset + 3));
        entity.setDescription(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setBeginTime(cursor.getLong(offset + 5));
        entity.setEndTime(cursor.isNull(offset + 6) ? null : cursor.getLong(offset + 6));
        entity.setPointsNum(cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7));
        entity.setFirstPointTime(cursor.isNull(offset + 8) ? null : cursor.getLong(offset + 8));
        entity.setLastPointTime(cursor.isNull(offset + 9) ? null : cursor.getLong(offset + 9));
        entity.setMovingTime(cursor.isNull(offset + 10) ? null : cursor.getLong(offset + 10));
        entity.setMovingDistance(cursor.isNull(offset + 11) ? null : cursor.getDouble(offset + 11));
        entity.setSimulateTime(cursor.isNull(offset + 12) ? null : cursor.getLong(offset + 12));
        entity.setSceneryNum(cursor.isNull(offset + 13) ? null : cursor.getInt(offset + 13));
        entity.setRecordStatus(cursor.isNull(offset + 14) ? null : cursor.getInt(offset + 14));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Track entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Track entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
