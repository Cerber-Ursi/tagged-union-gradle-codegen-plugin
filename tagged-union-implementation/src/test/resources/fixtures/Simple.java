import ru.cerbe.typelevel.union.VariantConstructor;

class Simple {

  String value;
  List<String> values;

  @VariantConstructor(name = "First")
  static Simple first(String value) {
    Simple ret = new Simple();
    res.value = value;
    return ret;
  }

  @VariantConstructor(name = "Second")
  static Simple second(List<String> values) {
    Simple ret = new Simple();
    res.values = values;
    return ret;
  }

}