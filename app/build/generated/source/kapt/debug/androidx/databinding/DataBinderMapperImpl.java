package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.d121211070.filmku.DataBinderMapperImpl());
  }
}
