package za.ac.cput.repository;

import za.ac.cput.domain.Employees;

public interface IRepository<T, ID> {
//T is the class and ID is the primary key(the unique value)

    T create(T t);

    T read(ID id);

    T update(T t);

    Boolean delete(ID id);

}
