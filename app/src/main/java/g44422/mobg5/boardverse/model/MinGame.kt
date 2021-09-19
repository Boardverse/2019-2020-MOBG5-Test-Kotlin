package g44422.mobg5.boardverse.model

import android.os.Parcel
import android.os.Parcelable

class MinGame(val id: Int, val name: String, val rating: Float, val thumbnailURL: String) :
    Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readFloat(),
        parcel.readString()!!
    ) {
    }

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        if (dest != null) {
            dest.writeInt(id)
            dest.writeString(name)
            dest.writeFloat(rating)
            dest.writeString(thumbnailURL)
        }
    }

    override fun describeContents(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    companion object CREATOR : Parcelable.Creator<MinGame> {
        override fun createFromParcel(parcel: Parcel): MinGame {
            return MinGame(parcel)
        }

        override fun newArray(size: Int): Array<MinGame?> {
            return arrayOfNulls(size)
        }
    }
}