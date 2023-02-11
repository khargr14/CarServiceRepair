package binary;

import java.util.Objects;

public class CarService extends BaseEntity {


        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            CarService that = (CarService) o;
            return getId() == that.getId() && Objects.equals(name, that.name);
        }

    }
