package com.erdemserhat.basicstatecodelab.ui.theme

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Checkbox
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue

import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.unit.dp
import androidx.lifecycle.Observer
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun WellnessTaskItem(
    taskName:String,
    checked:Boolean,
    onCheckedChange:(Boolean)->Unit,
    onClose:()->Unit,
    modifier: Modifier = Modifier
){
    Row(
        verticalAlignment = Alignment.CenterVertically,
    ){
        Text(
            text=taskName,
            modifier = Modifier
                .weight(1f)
                .padding(start = 10.dp),
            fontSize = 20.sp
        )

        Checkbox(
            checked = checked,
            onCheckedChange = onCheckedChange
        )

        IconButton(onClick = onClose) {
            Icon(
                Icons.Filled.Close,
                contentDescription = null


            )

        }
    }

}

//@Composable
//fun WellnessTaskItem(
//    taskName: String,
//    modifier: Modifier = Modifier,
//    onClose: () -> Unit
//) {
//    var checkedState by rememberSaveable { mutableStateOf(false) }
//
//    WellnessTaskItem(
//        taskName = taskName,
//        checked = checkedState,
//        onCheckedChange = { newValue -> checkedState = newValue },
//        onClose = onClose, // we will implement this later!
//        modifier = modifier,
//    )
//}
//


