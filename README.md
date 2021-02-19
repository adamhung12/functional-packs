### functional-packs
A library for provide simple functional tools, such mutable tuples, scoping tool and zipping stream with index function.

### Scope

scope allow create temp object for initializing or mapping transformation of object.

Demo object
```java
    public static class X {
        public int value = 0;

        public X(int x) {
            this.value = x;
        }

        public X() {
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            AppTest.X x = (AppTest.X) o;
            return value == x.value;
        }

        @Override
        public int hashCode() {
            return Objects.hash(value);
        }
    }
```

Create Scoped Object
```java
  Scope<X> scoped = Scope.of(new X());
```

** let(Function<I, O> function) **
let function allow transformation operation by returning a scoped new object
```java
  Scope<String> x = Scope.of(new X())
          .let(it -> {
              System.out.println(it.value);
              return "sss";
          })
          ;
```
