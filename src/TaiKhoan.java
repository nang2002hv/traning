public class TaiKhoan {
    private long sodu;

    public TaiKhoan(long sodu) {
        this.sodu = sodu;

    }

    public long getSodu() {
        return sodu;
    }

    public void setSodu(long sodu) throws SoDuKhongDuException{
        if(sodu > this.sodu){
            throw new SoDuKhongDuException("So du khong du");
        }
        this.sodu = this.sodu - sodu;

    }
}
