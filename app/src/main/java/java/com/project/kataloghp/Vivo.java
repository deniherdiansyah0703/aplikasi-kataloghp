package com.project.kataloghp;


import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Vivo implements Parcelable {
    private String name,prosesor,camera,ram,rom;
    private int photo;

    public Vivo(){

    }

    protected Vivo(Parcel in) {
        name = in.readString();
        prosesor = in.readString();
        camera = in.readString();
        ram = in.readString();
        rom = in.readString();
        photo = in.readInt();
    }

    public static final Creator<Vivo> CREATOR = new Creator<Vivo>() {
        @Override
        public Vivo createFromParcel(Parcel in) {
            return new Vivo(in);
        }

        @Override
        public Vivo[] newArray(int size) {
            return new Vivo[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getProsesor() {
        return prosesor;
    }

    public void setProsesor(String prosesor) {
        this.prosesor = prosesor;
    }


    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }



    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getRom() {
        return rom;
    }

    public void setRom(String rom) {
        this.rom = rom;
    }



//    public String getDetail() {
//        return detail;
//    }

//    public void setDetail(String detail) {
//        this.detail = detail;
//    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(prosesor);
        dest.writeString(camera);
        dest.writeString(ram);
        dest.writeString(rom);
//        dest.writeString(detail);
        dest.writeInt(photo);
    }


}
