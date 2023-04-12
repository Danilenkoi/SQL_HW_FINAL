import javax.persistence.*;
public class Main {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("myPersistenceUnit");

        EntityManager entityManager =
                entityManagerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        Author author = entityManager.find(Author.class, 1);

        Author author1 = entityManager.find(Author.class, 1);

        transaction.commit();

        entityManager.close();

        entityManagerFactory.close();
    }
}
