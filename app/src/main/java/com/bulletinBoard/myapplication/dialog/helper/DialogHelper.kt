package com.bulletinBoard.myapplication.dialog.helper

import android.app.AlertDialog
import com.bulletinBoard.myapplication.MainActivity
import com.bulletinBoard.myapplication.R
import com.bulletinBoard.myapplication.databinding.SignDialogBinding

class DialogHelper(act:MainActivity) {
    private val act = act

    fun createSignDialog(index:Int) {
        val builder = AlertDialog.Builder(act)
        val rootDialogElement = SignDialogBinding.inflate(act.layoutInflater)
        val view = rootDialogElement.root
        if (index == DialogConst.SIGN_UP_STATE){
            rootDialogElement.tvSignTitle.text = act.resources.getString(R.string.ad_sign_up)
            rootDialogElement.btSignUpIn.text = act.resources.getString(R.string.sign_up_action)
        } else {
            rootDialogElement.tvSignTitle.text = act.resources.getString(R.string.ad_sign_in)
            rootDialogElement.btSignUpIn.text = act.resources.getString(R.string.sign_in_action)
        }
        builder.setView(view)
        builder.show()
    }
}