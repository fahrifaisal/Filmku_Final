package com.d121211070.filmku.roomDataBaase;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.d121211070.filmku.models.MovieItem;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Double;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ProductDao_Impl implements ProductDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<MovieItem> __insertionAdapterOfMovieItem;

  private final Converter __converter = new Converter();

  private final EntityDeletionOrUpdateAdapter<MovieItem> __deletionAdapterOfMovieItem;

  private final EntityDeletionOrUpdateAdapter<MovieItem> __updateAdapterOfMovieItem;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public ProductDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMovieItem = new EntityInsertionAdapter<MovieItem>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Movie_table` (`Id`,`adult`,`backdrop_path`,`first_air_date`,`genre_ids`,`media_type`,`name`,`original_language`,`original_name`,`original_title`,`overview`,`popularity`,`poster_path`,`release_date`,`title`,`video`,`vote_average`,`vote_count`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MovieItem value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        final Integer _tmp = value.getAdult() == null ? null : (value.getAdult() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, _tmp);
        }
        if (value.getBackdrop_path() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getBackdrop_path());
        }
        if (value.getFirst_air_date() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getFirst_air_date());
        }
        final String _tmp_1 = __converter.stringToList(value.getGenre_ids());
        if (_tmp_1 == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp_1);
        }
        if (value.getMedia_type() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getMedia_type());
        }
        if (value.getName() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getName());
        }
        if (value.getOriginal_language() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getOriginal_language());
        }
        if (value.getOriginal_name() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getOriginal_name());
        }
        if (value.getOriginal_title() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getOriginal_title());
        }
        if (value.getOverview() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getOverview());
        }
        if (value.getPopularity() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindDouble(12, value.getPopularity());
        }
        if (value.getPoster_path() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getPoster_path());
        }
        if (value.getRelease_date() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getRelease_date());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getTitle());
        }
        final Integer _tmp_2 = value.getVideo() == null ? null : (value.getVideo() ? 1 : 0);
        if (_tmp_2 == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindLong(16, _tmp_2);
        }
        if (value.getVote_average() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindDouble(17, value.getVote_average());
        }
        if (value.getVote_count() == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindLong(18, value.getVote_count());
        }
      }
    };
    this.__deletionAdapterOfMovieItem = new EntityDeletionOrUpdateAdapter<MovieItem>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Movie_table` WHERE `Id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MovieItem value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
      }
    };
    this.__updateAdapterOfMovieItem = new EntityDeletionOrUpdateAdapter<MovieItem>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Movie_table` SET `Id` = ?,`adult` = ?,`backdrop_path` = ?,`first_air_date` = ?,`genre_ids` = ?,`media_type` = ?,`name` = ?,`original_language` = ?,`original_name` = ?,`original_title` = ?,`overview` = ?,`popularity` = ?,`poster_path` = ?,`release_date` = ?,`title` = ?,`video` = ?,`vote_average` = ?,`vote_count` = ? WHERE `Id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MovieItem value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        final Integer _tmp = value.getAdult() == null ? null : (value.getAdult() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, _tmp);
        }
        if (value.getBackdrop_path() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getBackdrop_path());
        }
        if (value.getFirst_air_date() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getFirst_air_date());
        }
        final String _tmp_1 = __converter.stringToList(value.getGenre_ids());
        if (_tmp_1 == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp_1);
        }
        if (value.getMedia_type() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getMedia_type());
        }
        if (value.getName() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getName());
        }
        if (value.getOriginal_language() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getOriginal_language());
        }
        if (value.getOriginal_name() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getOriginal_name());
        }
        if (value.getOriginal_title() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getOriginal_title());
        }
        if (value.getOverview() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getOverview());
        }
        if (value.getPopularity() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindDouble(12, value.getPopularity());
        }
        if (value.getPoster_path() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getPoster_path());
        }
        if (value.getRelease_date() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getRelease_date());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getTitle());
        }
        final Integer _tmp_2 = value.getVideo() == null ? null : (value.getVideo() ? 1 : 0);
        if (_tmp_2 == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindLong(16, _tmp_2);
        }
        if (value.getVote_average() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindDouble(17, value.getVote_average());
        }
        if (value.getVote_count() == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindLong(18, value.getVote_count());
        }
        if (value.getId() == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindLong(19, value.getId());
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM Movie_table";
        return _query;
      }
    };
  }

  @Override
  public Object insertData(final MovieItem item, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfMovieItem.insert(item);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object delete(final MovieItem item, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfMovieItem.handle(item);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object update(final MovieItem item, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfMovieItem.handle(item);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteAll(final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAll.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public List<MovieItem> readAllData() {
    final String _sql = "SELECT * FROM Movie_table ORDER BY Id ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "Id");
      final int _cursorIndexOfAdult = CursorUtil.getColumnIndexOrThrow(_cursor, "adult");
      final int _cursorIndexOfBackdropPath = CursorUtil.getColumnIndexOrThrow(_cursor, "backdrop_path");
      final int _cursorIndexOfFirstAirDate = CursorUtil.getColumnIndexOrThrow(_cursor, "first_air_date");
      final int _cursorIndexOfGenreIds = CursorUtil.getColumnIndexOrThrow(_cursor, "genre_ids");
      final int _cursorIndexOfMediaType = CursorUtil.getColumnIndexOrThrow(_cursor, "media_type");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfOriginalLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "original_language");
      final int _cursorIndexOfOriginalName = CursorUtil.getColumnIndexOrThrow(_cursor, "original_name");
      final int _cursorIndexOfOriginalTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "original_title");
      final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
      final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(_cursor, "popularity");
      final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "poster_path");
      final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "release_date");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfVideo = CursorUtil.getColumnIndexOrThrow(_cursor, "video");
      final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_average");
      final int _cursorIndexOfVoteCount = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_count");
      final List<MovieItem> _result = new ArrayList<MovieItem>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final MovieItem _item;
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        final Boolean _tmpAdult;
        final Integer _tmp;
        if (_cursor.isNull(_cursorIndexOfAdult)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getInt(_cursorIndexOfAdult);
        }
        _tmpAdult = _tmp == null ? null : _tmp != 0;
        final String _tmpBackdrop_path;
        if (_cursor.isNull(_cursorIndexOfBackdropPath)) {
          _tmpBackdrop_path = null;
        } else {
          _tmpBackdrop_path = _cursor.getString(_cursorIndexOfBackdropPath);
        }
        final String _tmpFirst_air_date;
        if (_cursor.isNull(_cursorIndexOfFirstAirDate)) {
          _tmpFirst_air_date = null;
        } else {
          _tmpFirst_air_date = _cursor.getString(_cursorIndexOfFirstAirDate);
        }
        final List<String> _tmpGenre_ids;
        final String _tmp_1;
        if (_cursor.isNull(_cursorIndexOfGenreIds)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getString(_cursorIndexOfGenreIds);
        }
        _tmpGenre_ids = __converter.listToString(_tmp_1);
        final String _tmpMedia_type;
        if (_cursor.isNull(_cursorIndexOfMediaType)) {
          _tmpMedia_type = null;
        } else {
          _tmpMedia_type = _cursor.getString(_cursorIndexOfMediaType);
        }
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final String _tmpOriginal_language;
        if (_cursor.isNull(_cursorIndexOfOriginalLanguage)) {
          _tmpOriginal_language = null;
        } else {
          _tmpOriginal_language = _cursor.getString(_cursorIndexOfOriginalLanguage);
        }
        final String _tmpOriginal_name;
        if (_cursor.isNull(_cursorIndexOfOriginalName)) {
          _tmpOriginal_name = null;
        } else {
          _tmpOriginal_name = _cursor.getString(_cursorIndexOfOriginalName);
        }
        final String _tmpOriginal_title;
        if (_cursor.isNull(_cursorIndexOfOriginalTitle)) {
          _tmpOriginal_title = null;
        } else {
          _tmpOriginal_title = _cursor.getString(_cursorIndexOfOriginalTitle);
        }
        final String _tmpOverview;
        if (_cursor.isNull(_cursorIndexOfOverview)) {
          _tmpOverview = null;
        } else {
          _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
        }
        final Double _tmpPopularity;
        if (_cursor.isNull(_cursorIndexOfPopularity)) {
          _tmpPopularity = null;
        } else {
          _tmpPopularity = _cursor.getDouble(_cursorIndexOfPopularity);
        }
        final String _tmpPoster_path;
        if (_cursor.isNull(_cursorIndexOfPosterPath)) {
          _tmpPoster_path = null;
        } else {
          _tmpPoster_path = _cursor.getString(_cursorIndexOfPosterPath);
        }
        final String _tmpRelease_date;
        if (_cursor.isNull(_cursorIndexOfReleaseDate)) {
          _tmpRelease_date = null;
        } else {
          _tmpRelease_date = _cursor.getString(_cursorIndexOfReleaseDate);
        }
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final Boolean _tmpVideo;
        final Integer _tmp_2;
        if (_cursor.isNull(_cursorIndexOfVideo)) {
          _tmp_2 = null;
        } else {
          _tmp_2 = _cursor.getInt(_cursorIndexOfVideo);
        }
        _tmpVideo = _tmp_2 == null ? null : _tmp_2 != 0;
        final Double _tmpVote_average;
        if (_cursor.isNull(_cursorIndexOfVoteAverage)) {
          _tmpVote_average = null;
        } else {
          _tmpVote_average = _cursor.getDouble(_cursorIndexOfVoteAverage);
        }
        final Integer _tmpVote_count;
        if (_cursor.isNull(_cursorIndexOfVoteCount)) {
          _tmpVote_count = null;
        } else {
          _tmpVote_count = _cursor.getInt(_cursorIndexOfVoteCount);
        }
        _item = new MovieItem(_tmpId,_tmpAdult,_tmpBackdrop_path,_tmpFirst_air_date,_tmpGenre_ids,_tmpMedia_type,_tmpName,_tmpOriginal_language,_tmpOriginal_name,_tmpOriginal_title,_tmpOverview,_tmpPopularity,_tmpPoster_path,_tmpRelease_date,_tmpTitle,_tmpVideo,_tmpVote_average,_tmpVote_count);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
