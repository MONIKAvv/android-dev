package vv.monika.myfirstapp

import android.content.Context
import android.view.View
import android.widget.PopupMenu
import android.widget.Toast
import kotlin.coroutines.coroutineContext

class Menucustom {

    fun showMenu(context: Context, view: View) {
        val pop = PopupMenu(context, view)
        pop.inflate(R.menu.menu)

        pop.setOnMenuItemClickListener {
            when (it!!.itemId) {
                R.id.view -> {
                    Toast.makeText(context, "Clicked View", Toast.LENGTH_SHORT).show()
                    true
                }

                R.id.delete -> {
                    Toast.makeText(context, "Clicked delete", Toast.LENGTH_SHORT).show()
                    true
                }

                R.id.share -> {
                    Toast.makeText(context, "Clicked Share", Toast.LENGTH_SHORT).show()
                    true
                }

                else -> false
            }
        }

        try {
            val fieldMpopup = PopupMenu::class.java.getDeclaredField("mPopup")
            fieldMpopup.isAccessible = true
            val mPopup = fieldMpopup.get(pop)
            mPopup.javaClass
                .getDeclaredMethod("setForceShowIcon", Boolean::class.java)
                .invoke(mPopup, true)
        } catch (e: Exception) {

        } finally {
            pop.show()
        }
// this try block force to show the icon to the screen and by defauly android won't show it
    }
}