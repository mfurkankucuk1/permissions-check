package tr.mfk.permissionchecker

import android.app.Activity
import android.os.Build

class PermissionsCheck(private val activity: Activity) {

    fun checkAndRequestPermissions(permissions: Array<String>, requestCode: Int) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            val permissionsToRequest = permissions.filter {
                !PermissionUtils.checkPermission(activity, it) &&
                        PermissionUtils.shouldShowRequestPermissionRationale(activity, it)
            }.toTypedArray()

            if (permissionsToRequest.isNotEmpty()) {
                PermissionUtils.requestPermission(activity, permissionsToRequest, requestCode)
            }
        }
    }
}