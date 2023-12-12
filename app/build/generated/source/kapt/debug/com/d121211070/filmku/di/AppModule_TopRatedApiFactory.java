// Generated by Dagger (https://dagger.dev).
package com.d121211070.filmku.di;

import com.d121211070.filmku.data.apiInterfaces.TopRatedInterface;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_TopRatedApiFactory implements Factory<TopRatedInterface> {
  @Override
  public TopRatedInterface get() {
    return topRatedApi();
  }

  public static AppModule_TopRatedApiFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static TopRatedInterface topRatedApi() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.topRatedApi());
  }

  private static final class InstanceHolder {
    private static final AppModule_TopRatedApiFactory INSTANCE = new AppModule_TopRatedApiFactory();
  }
}
