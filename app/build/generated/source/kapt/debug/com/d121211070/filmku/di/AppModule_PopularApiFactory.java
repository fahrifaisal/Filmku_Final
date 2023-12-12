// Generated by Dagger (https://dagger.dev).
package com.d121211070.filmku.di;

import com.d121211070.filmku.data.apiInterfaces.PopularInterface;
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
public final class AppModule_PopularApiFactory implements Factory<PopularInterface> {
  @Override
  public PopularInterface get() {
    return popularApi();
  }

  public static AppModule_PopularApiFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static PopularInterface popularApi() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.popularApi());
  }

  private static final class InstanceHolder {
    private static final AppModule_PopularApiFactory INSTANCE = new AppModule_PopularApiFactory();
  }
}
