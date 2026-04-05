public interface IEntity {
    void kick();
    void setDead(); // Menandai bahwa entitas sudah mati
    boolean isAlive(); // Mengecek apakah entitas masih hidup
}
