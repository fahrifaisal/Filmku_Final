// Generated by Dagger (https://dagger.dev).
package com.d121211070.filmku.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import retrofit2.Retrofit;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_RetrofitProviderFactory implements Factory<Retrofit> {
  @Override
  public Retrofit get() {
    return retrofitProvider();
  }

  public static AppModule_RetrofitProviderFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Retrofit retrofitProvider() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.retrofitProvider());
  }

  private static final class InstanceHolder {
    private static final AppModule_RetrofitProviderFactory INSTANCE = new AppModule_RetrofitProviderFactory();
  }
}