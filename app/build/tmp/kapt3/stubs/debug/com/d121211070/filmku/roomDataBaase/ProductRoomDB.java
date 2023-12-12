package com.d121211070.filmku.roomDataBaase;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import com.d121211070.filmku.models.MovieItem;

@androidx.room.TypeConverters(value = {com.d121211070.filmku.roomDataBaase.Converter.class})
@androidx.room.Database(entities = {com.d121211070.filmku.models.MovieItem.class}, version = 1)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/d121211070/filmku/roomDataBaase/ProductRoomDB;", "Landroidx/room/RoomDatabase;", "()V", "getProductsDao", "Lcom/d121211070/filmku/roomDataBaase/ProductDao;", "Companion", "app_debug"})
public abstract class ProductRoomDB extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull
    public static final com.d121211070.filmku.roomDataBaase.ProductRoomDB.Companion Companion = null;
    @kotlin.jvm.Volatile
    private static volatile com.d121211070.filmku.roomDataBaase.ProductRoomDB INSTANCE;
    
    public ProductRoomDB() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.d121211070.filmku.roomDataBaase.ProductDao getProductsDao();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/d121211070/filmku/roomDataBaase/ProductRoomDB$Companion;", "", "()V", "INSTANCE", "Lcom/d121211070/filmku/roomDataBaase/ProductRoomDB;", "getDatabase", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.d121211070.filmku.roomDataBaase.ProductRoomDB getDatabase(@org.jetbrains.annotations.Nullable
        android.content.Context context) {
            return null;
        }
    }
}